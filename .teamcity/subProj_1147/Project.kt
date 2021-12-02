package subProj_1147

import subProj_1147.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1147")
    name = "subProj 1147"

    buildType(subProj_bt_1147_1)
    buildType(subProj_bt_1147_2)
    buildType(subProj_bt_1147_0)
    buildType(subProj_bt_1147_5)
    buildType(subProj_bt_1147_3)
    buildType(subProj_bt_1147_4)
})
