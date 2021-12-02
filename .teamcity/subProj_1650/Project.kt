package subProj_1650

import subProj_1650.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1650")
    name = "subProj 1650"

    buildType(subProj_bt_1650_1)
    buildType(subProj_bt_1650_0)
    buildType(subProj_bt_1650_3)
    buildType(subProj_bt_1650_2)
    buildType(subProj_bt_1650_5)
    buildType(subProj_bt_1650_4)
})
