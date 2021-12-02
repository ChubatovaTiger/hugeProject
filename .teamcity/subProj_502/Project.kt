package subProj_502

import subProj_502.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_502")
    name = "subProj 502"

    buildType(subProj_bt_502_5)
    buildType(subProj_bt_502_3)
    buildType(subProj_bt_502_4)
    buildType(subProj_bt_502_1)
    buildType(subProj_bt_502_2)
    buildType(subProj_bt_502_0)
})
