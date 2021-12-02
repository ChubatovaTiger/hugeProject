package subProj_57

import subProj_57.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_57")
    name = "subProj 57"

    buildType(subProj_bt_57_1)
    buildType(subProj_bt_57_0)
    buildType(subProj_bt_57_3)
    buildType(subProj_bt_57_2)
    buildType(subProj_bt_57_5)
    buildType(subProj_bt_57_4)
})
