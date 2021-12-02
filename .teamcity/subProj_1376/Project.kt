package subProj_1376

import subProj_1376.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1376")
    name = "subProj 1376"

    buildType(subProj_bt_1376_1)
    buildType(subProj_bt_1376_2)
    buildType(subProj_bt_1376_3)
    buildType(subProj_bt_1376_4)
    buildType(subProj_bt_1376_5)
    buildType(subProj_bt_1376_0)
})
