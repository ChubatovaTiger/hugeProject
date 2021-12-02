package subProj_704

import subProj_704.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_704")
    name = "subProj 704"

    buildType(subProj_bt_704_3)
    buildType(subProj_bt_704_4)
    buildType(subProj_bt_704_1)
    buildType(subProj_bt_704_2)
    buildType(subProj_bt_704_5)
    buildType(subProj_bt_704_0)
})
