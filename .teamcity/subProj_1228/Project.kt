package subProj_1228

import subProj_1228.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1228")
    name = "subProj 1228"

    buildType(subProj_bt_1228_0)
    buildType(subProj_bt_1228_1)
    buildType(subProj_bt_1228_2)
    buildType(subProj_bt_1228_3)
    buildType(subProj_bt_1228_4)
    buildType(subProj_bt_1228_5)
})
