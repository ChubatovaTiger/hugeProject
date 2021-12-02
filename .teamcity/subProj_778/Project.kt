package subProj_778

import subProj_778.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_778")
    name = "subProj 778"

    buildType(subProj_bt_778_5)
    buildType(subProj_bt_778_4)
    buildType(subProj_bt_778_1)
    buildType(subProj_bt_778_0)
    buildType(subProj_bt_778_3)
    buildType(subProj_bt_778_2)
})
