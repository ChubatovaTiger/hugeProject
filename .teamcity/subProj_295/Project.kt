package subProj_295

import subProj_295.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_295")
    name = "subProj 295"

    buildType(subProj_bt_295_0)
    buildType(subProj_bt_295_1)
    buildType(subProj_bt_295_2)
    buildType(subProj_bt_295_3)
    buildType(subProj_bt_295_4)
    buildType(subProj_bt_295_5)
})
