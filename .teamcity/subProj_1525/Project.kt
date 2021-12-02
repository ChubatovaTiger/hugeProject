package subProj_1525

import subProj_1525.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1525")
    name = "subProj 1525"

    buildType(subProj_bt_1525_5)
    buildType(subProj_bt_1525_3)
    buildType(subProj_bt_1525_4)
    buildType(subProj_bt_1525_1)
    buildType(subProj_bt_1525_2)
    buildType(subProj_bt_1525_0)
})
