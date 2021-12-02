package subProj_1073

import subProj_1073.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1073")
    name = "subProj 1073"

    buildType(subProj_bt_1073_5)
    buildType(subProj_bt_1073_3)
    buildType(subProj_bt_1073_4)
    buildType(subProj_bt_1073_1)
    buildType(subProj_bt_1073_2)
    buildType(subProj_bt_1073_0)
})
