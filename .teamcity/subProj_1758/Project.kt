package subProj_1758

import subProj_1758.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1758")
    name = "subProj 1758"

    buildType(subProj_bt_1758_0)
    buildType(subProj_bt_1758_5)
    buildType(subProj_bt_1758_4)
    buildType(subProj_bt_1758_3)
    buildType(subProj_bt_1758_2)
    buildType(subProj_bt_1758_1)
})
