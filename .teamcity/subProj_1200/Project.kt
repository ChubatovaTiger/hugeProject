package subProj_1200

import subProj_1200.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1200")
    name = "subProj 1200"

    buildType(subProj_bt_1200_0)
    buildType(subProj_bt_1200_5)
    buildType(subProj_bt_1200_4)
    buildType(subProj_bt_1200_3)
    buildType(subProj_bt_1200_2)
    buildType(subProj_bt_1200_1)
})
