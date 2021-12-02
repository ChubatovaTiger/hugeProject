package subProj_951

import subProj_951.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_951")
    name = "subProj 951"

    buildType(subProj_bt_951_0)
    buildType(subProj_bt_951_2)
    buildType(subProj_bt_951_1)
    buildType(subProj_bt_951_4)
    buildType(subProj_bt_951_3)
    buildType(subProj_bt_951_5)
})
