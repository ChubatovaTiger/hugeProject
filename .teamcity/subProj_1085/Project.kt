package subProj_1085

import subProj_1085.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1085")
    name = "subProj 1085"

    buildType(subProj_bt_1085_4)
    buildType(subProj_bt_1085_5)
    buildType(subProj_bt_1085_2)
    buildType(subProj_bt_1085_3)
    buildType(subProj_bt_1085_0)
    buildType(subProj_bt_1085_1)
})
