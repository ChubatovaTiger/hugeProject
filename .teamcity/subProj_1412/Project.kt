package subProj_1412

import subProj_1412.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1412")
    name = "subProj 1412"

    buildType(subProj_bt_1412_1)
    buildType(subProj_bt_1412_0)
    buildType(subProj_bt_1412_5)
    buildType(subProj_bt_1412_4)
    buildType(subProj_bt_1412_3)
    buildType(subProj_bt_1412_2)
})
