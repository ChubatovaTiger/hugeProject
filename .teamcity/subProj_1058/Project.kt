package subProj_1058

import subProj_1058.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1058")
    name = "subProj 1058"

    buildType(subProj_bt_1058_5)
    buildType(subProj_bt_1058_4)
    buildType(subProj_bt_1058_1)
    buildType(subProj_bt_1058_0)
    buildType(subProj_bt_1058_3)
    buildType(subProj_bt_1058_2)
})
