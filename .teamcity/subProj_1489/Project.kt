package subProj_1489

import subProj_1489.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1489")
    name = "subProj 1489"

    buildType(subProj_bt_1489_5)
    buildType(subProj_bt_1489_4)
    buildType(subProj_bt_1489_3)
    buildType(subProj_bt_1489_2)
    buildType(subProj_bt_1489_1)
    buildType(subProj_bt_1489_0)
})
