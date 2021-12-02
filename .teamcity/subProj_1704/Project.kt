package subProj_1704

import subProj_1704.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1704")
    name = "subProj 1704"

    buildType(subProj_bt_1704_5)
    buildType(subProj_bt_1704_4)
    buildType(subProj_bt_1704_1)
    buildType(subProj_bt_1704_0)
    buildType(subProj_bt_1704_3)
    buildType(subProj_bt_1704_2)
})
