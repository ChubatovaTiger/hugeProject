package subProj_489

import subProj_489.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_489")
    name = "subProj 489"

    buildType(subProj_bt_489_3)
    buildType(subProj_bt_489_4)
    buildType(subProj_bt_489_5)
    buildType(subProj_bt_489_0)
    buildType(subProj_bt_489_1)
    buildType(subProj_bt_489_2)
})
