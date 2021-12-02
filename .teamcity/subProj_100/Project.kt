package subProj_100

import subProj_100.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_100")
    name = "subProj 100"

    buildType(subProj_bt_100_5)
    buildType(subProj_bt_100_3)
    buildType(subProj_bt_100_4)
    buildType(subProj_bt_100_1)
    buildType(subProj_bt_100_2)
    buildType(subProj_bt_100_0)
})
