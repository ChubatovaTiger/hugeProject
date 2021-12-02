package subProj_1978

import subProj_1978.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1978")
    name = "subProj 1978"

    buildType(subProj_bt_1978_0)
    buildType(subProj_bt_1978_5)
    buildType(subProj_bt_1978_2)
    buildType(subProj_bt_1978_1)
    buildType(subProj_bt_1978_4)
    buildType(subProj_bt_1978_3)
})
