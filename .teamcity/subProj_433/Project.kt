package subProj_433

import subProj_433.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_433")
    name = "subProj 433"

    buildType(subProj_bt_433_1)
    buildType(subProj_bt_433_0)
    buildType(subProj_bt_433_3)
    buildType(subProj_bt_433_2)
    buildType(subProj_bt_433_5)
    buildType(subProj_bt_433_4)
})
