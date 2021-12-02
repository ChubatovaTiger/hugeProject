package subProj_1411

import subProj_1411.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1411")
    name = "subProj 1411"

    buildType(subProj_bt_1411_2)
    buildType(subProj_bt_1411_1)
    buildType(subProj_bt_1411_0)
    buildType(subProj_bt_1411_5)
    buildType(subProj_bt_1411_4)
    buildType(subProj_bt_1411_3)
})
