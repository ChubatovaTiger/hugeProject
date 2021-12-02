package subProj_1972

import subProj_1972.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1972")
    name = "subProj 1972"

    buildType(subProj_bt_1972_3)
    buildType(subProj_bt_1972_4)
    buildType(subProj_bt_1972_5)
    buildType(subProj_bt_1972_0)
    buildType(subProj_bt_1972_1)
    buildType(subProj_bt_1972_2)
})
