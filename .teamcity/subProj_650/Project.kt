package subProj_650

import subProj_650.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_650")
    name = "subProj 650"

    buildType(subProj_bt_650_1)
    buildType(subProj_bt_650_2)
    buildType(subProj_bt_650_0)
    buildType(subProj_bt_650_5)
    buildType(subProj_bt_650_3)
    buildType(subProj_bt_650_4)
})
