package subProj_1028

import subProj_1028.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1028")
    name = "subProj 1028"

    buildType(subProj_bt_1028_0)
    buildType(subProj_bt_1028_4)
    buildType(subProj_bt_1028_3)
    buildType(subProj_bt_1028_2)
    buildType(subProj_bt_1028_1)
    buildType(subProj_bt_1028_5)
})
