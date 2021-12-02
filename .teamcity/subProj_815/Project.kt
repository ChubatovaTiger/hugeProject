package subProj_815

import subProj_815.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_815")
    name = "subProj 815"

    buildType(subProj_bt_815_1)
    buildType(subProj_bt_815_0)
    buildType(subProj_bt_815_3)
    buildType(subProj_bt_815_2)
    buildType(subProj_bt_815_5)
    buildType(subProj_bt_815_4)
})
