package subProj_1449

import subProj_1449.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1449")
    name = "subProj 1449"

    buildType(subProj_bt_1449_3)
    buildType(subProj_bt_1449_2)
    buildType(subProj_bt_1449_5)
    buildType(subProj_bt_1449_4)
    buildType(subProj_bt_1449_1)
    buildType(subProj_bt_1449_0)
})
