package subProj_1336

import subProj_1336.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1336")
    name = "subProj 1336"

    buildType(subProj_bt_1336_5)
    buildType(subProj_bt_1336_3)
    buildType(subProj_bt_1336_4)
    buildType(subProj_bt_1336_1)
    buildType(subProj_bt_1336_2)
    buildType(subProj_bt_1336_0)
})
