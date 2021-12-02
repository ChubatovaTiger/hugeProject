package subProj_1050

import subProj_1050.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1050")
    name = "subProj 1050"

    buildType(subProj_bt_1050_5)
    buildType(subProj_bt_1050_4)
    buildType(subProj_bt_1050_1)
    buildType(subProj_bt_1050_0)
    buildType(subProj_bt_1050_3)
    buildType(subProj_bt_1050_2)
})
