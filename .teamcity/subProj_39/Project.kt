package subProj_39

import subProj_39.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_39")
    name = "subProj 39"

    buildType(subProj_bt_39_4)
    buildType(subProj_bt_39_5)
    buildType(subProj_bt_39_0)
    buildType(subProj_bt_39_1)
    buildType(subProj_bt_39_2)
    buildType(subProj_bt_39_3)
})
