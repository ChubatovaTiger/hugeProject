package subProj_1476

import subProj_1476.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1476")
    name = "subProj 1476"

    buildType(subProj_bt_1476_4)
    buildType(subProj_bt_1476_5)
    buildType(subProj_bt_1476_2)
    buildType(subProj_bt_1476_3)
    buildType(subProj_bt_1476_0)
    buildType(subProj_bt_1476_1)
})
