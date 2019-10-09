package dev.reactant.reactant.ui.element.type.sizing

import dev.reactant.reactant.ui.editing.UIElementEditing

interface ResizableElement : HeightResizableElement, WidthResizableElement

interface ResizableElementsEditing<out T : ResizableElement>
    : UIElementEditing<T>, HeightResizableElementEditing<T>, WidthResizableElementEditing<T>
