package subProj_1559

import subProj_1559.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1559")
    name = "subProj 1559"

    buildType(subProj_bt_1559_5)
    buildType(subProj_bt_1559_4)
    buildType(subProj_bt_1559_3)
    buildType(subProj_bt_1559_2)
    buildType(subProj_bt_1559_1)
    buildType(subProj_bt_1559_0)
})
