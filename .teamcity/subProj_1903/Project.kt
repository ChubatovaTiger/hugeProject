package subProj_1903

import subProj_1903.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1903")
    name = "subProj 1903"

    buildType(subProj_bt_1903_0)
    buildType(subProj_bt_1903_2)
    buildType(subProj_bt_1903_1)
    buildType(subProj_bt_1903_4)
    buildType(subProj_bt_1903_3)
    buildType(subProj_bt_1903_5)
})
