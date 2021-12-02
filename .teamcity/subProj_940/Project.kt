package subProj_940

import subProj_940.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_940")
    name = "subProj 940"

    buildType(subProj_bt_940_0)
    buildType(subProj_bt_940_1)
    buildType(subProj_bt_940_2)
    buildType(subProj_bt_940_3)
    buildType(subProj_bt_940_4)
    buildType(subProj_bt_940_5)
})
