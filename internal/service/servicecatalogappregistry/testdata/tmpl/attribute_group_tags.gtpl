resource "aws_servicecatalogappregistry_attribute_group" "test" {
  name        = var.rName
  description = "Some attribute group"

  attributes = {
    a = "1"
    b = "2"
  }
{{- template "tags" . }}
}
