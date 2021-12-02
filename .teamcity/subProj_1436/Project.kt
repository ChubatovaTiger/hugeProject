package subProj_1436

import subProj_1436.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1436")
    name = "subProj 1436"

    buildType(subProj_bt_1436_4)
    buildType(subProj_bt_1436_5)
    buildType(subProj_bt_1436_0)
    buildType(subProj_bt_1436_1)
    buildType(subProj_bt_1436_2)
    buildType(subProj_bt_1436_3)
})
