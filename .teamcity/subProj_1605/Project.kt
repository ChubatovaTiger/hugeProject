package subProj_1605

import subProj_1605.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1605")
    name = "subProj 1605"

    buildType(subProj_bt_1605_5)
    buildType(subProj_bt_1605_4)
    buildType(subProj_bt_1605_3)
    buildType(subProj_bt_1605_2)
    buildType(subProj_bt_1605_1)
    buildType(subProj_bt_1605_0)
})
