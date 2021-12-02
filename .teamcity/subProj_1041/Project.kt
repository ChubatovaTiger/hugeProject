package subProj_1041

import subProj_1041.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1041")
    name = "subProj 1041"

    buildType(subProj_bt_1041_2)
    buildType(subProj_bt_1041_3)
    buildType(subProj_bt_1041_4)
    buildType(subProj_bt_1041_5)
    buildType(subProj_bt_1041_0)
    buildType(subProj_bt_1041_1)
})
