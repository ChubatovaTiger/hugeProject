package subProj_1433

import subProj_1433.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1433")
    name = "subProj 1433"

    buildType(subProj_bt_1433_3)
    buildType(subProj_bt_1433_4)
    buildType(subProj_bt_1433_5)
    buildType(subProj_bt_1433_0)
    buildType(subProj_bt_1433_1)
    buildType(subProj_bt_1433_2)
})
