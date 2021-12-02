package subProj_542

import subProj_542.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_542")
    name = "subProj 542"

    buildType(subProj_bt_542_1)
    buildType(subProj_bt_542_2)
    buildType(subProj_bt_542_3)
    buildType(subProj_bt_542_4)
    buildType(subProj_bt_542_5)
    buildType(subProj_bt_542_0)
})
