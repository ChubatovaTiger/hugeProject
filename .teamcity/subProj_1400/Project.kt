package subProj_1400

import subProj_1400.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1400")
    name = "subProj 1400"

    buildType(subProj_bt_1400_2)
    buildType(subProj_bt_1400_1)
    buildType(subProj_bt_1400_0)
    buildType(subProj_bt_1400_5)
    buildType(subProj_bt_1400_4)
    buildType(subProj_bt_1400_3)
})
