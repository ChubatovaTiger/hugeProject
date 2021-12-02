package subProj_375

import subProj_375.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_375")
    name = "subProj 375"

    buildType(subProj_bt_375_4)
    buildType(subProj_bt_375_3)
    buildType(subProj_bt_375_5)
    buildType(subProj_bt_375_0)
    buildType(subProj_bt_375_2)
    buildType(subProj_bt_375_1)
})
