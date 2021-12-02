package subProj_1962

import subProj_1962.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1962")
    name = "subProj 1962"

    buildType(subProj_bt_1962_2)
    buildType(subProj_bt_1962_3)
    buildType(subProj_bt_1962_4)
    buildType(subProj_bt_1962_5)
    buildType(subProj_bt_1962_0)
    buildType(subProj_bt_1962_1)
})
