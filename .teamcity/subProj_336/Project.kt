package subProj_336

import subProj_336.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_336")
    name = "subProj 336"

    buildType(subProj_bt_336_1)
    buildType(subProj_bt_336_0)
    buildType(subProj_bt_336_5)
    buildType(subProj_bt_336_4)
    buildType(subProj_bt_336_3)
    buildType(subProj_bt_336_2)
})
