package subProj_939

import subProj_939.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_939")
    name = "subProj 939"

    buildType(subProj_bt_939_0)
    buildType(subProj_bt_939_1)
    buildType(subProj_bt_939_2)
    buildType(subProj_bt_939_3)
    buildType(subProj_bt_939_4)
    buildType(subProj_bt_939_5)
})
