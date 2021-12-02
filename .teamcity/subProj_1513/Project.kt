package subProj_1513

import subProj_1513.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1513")
    name = "subProj 1513"

    buildType(subProj_bt_1513_5)
    buildType(subProj_bt_1513_4)
    buildType(subProj_bt_1513_1)
    buildType(subProj_bt_1513_0)
    buildType(subProj_bt_1513_3)
    buildType(subProj_bt_1513_2)
})
