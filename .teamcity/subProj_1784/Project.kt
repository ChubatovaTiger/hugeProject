package subProj_1784

import subProj_1784.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1784")
    name = "subProj 1784"

    buildType(subProj_bt_1784_1)
    buildType(subProj_bt_1784_0)
    buildType(subProj_bt_1784_3)
    buildType(subProj_bt_1784_2)
    buildType(subProj_bt_1784_5)
    buildType(subProj_bt_1784_4)
})
