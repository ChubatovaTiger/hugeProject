package subProj_1814

import subProj_1814.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1814")
    name = "subProj 1814"

    buildType(subProj_bt_1814_4)
    buildType(subProj_bt_1814_5)
    buildType(subProj_bt_1814_0)
    buildType(subProj_bt_1814_1)
    buildType(subProj_bt_1814_2)
    buildType(subProj_bt_1814_3)
})
