package subProj_194

import subProj_194.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_194")
    name = "subProj 194"

    buildType(subProj_bt_194_2)
    buildType(subProj_bt_194_3)
    buildType(subProj_bt_194_0)
    buildType(subProj_bt_194_1)
    buildType(subProj_bt_194_4)
    buildType(subProj_bt_194_5)
})
