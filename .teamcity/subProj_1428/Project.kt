package subProj_1428

import subProj_1428.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1428")
    name = "subProj 1428"

    buildType(subProj_bt_1428_5)
    buildType(subProj_bt_1428_1)
    buildType(subProj_bt_1428_2)
    buildType(subProj_bt_1428_3)
    buildType(subProj_bt_1428_4)
    buildType(subProj_bt_1428_0)
})
