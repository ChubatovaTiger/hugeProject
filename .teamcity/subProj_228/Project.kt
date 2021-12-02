package subProj_228

import subProj_228.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_228")
    name = "subProj 228"

    buildType(subProj_bt_228_1)
    buildType(subProj_bt_228_0)
    buildType(subProj_bt_228_3)
    buildType(subProj_bt_228_2)
    buildType(subProj_bt_228_5)
    buildType(subProj_bt_228_4)
})
