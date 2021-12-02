package subProj_1277

import subProj_1277.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1277")
    name = "subProj 1277"

    buildType(subProj_bt_1277_3)
    buildType(subProj_bt_1277_4)
    buildType(subProj_bt_1277_1)
    buildType(subProj_bt_1277_2)
    buildType(subProj_bt_1277_5)
    buildType(subProj_bt_1277_0)
})
